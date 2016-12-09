package com.piano.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class PageTag extends TagSupport {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    //页号    第几页
    private int pageNo = 1;
    //页面大小，每一页显示几条记录
    private int pageSize = 5;
    //分页操作后台响应类，后台响应servlet
    private String url;
    //总的记录条数，本次分页操作所有的记录总数
    private int recordCount = 0;
    @Override
    public int doEndTag() throws JspException {
        // TODO Auto-generated method stub
        return super.doEndTag();
    }
    @Override
    public int doStartTag() throws JspException {
        // TODO Auto-generated method stub
        //自定义标签的业务逻辑处理，使用分页的相关参数，组织分页标签的内容
        StringBuilder tagContent = new StringBuilder();
        //组织自定义分页标签的css样式表
        tagContent
                  .append("<style type='text/scc'>")
                  .append(".pagination {padding:5px;float:right;font-size:12px;}")
                  .append(".pagination a, .pagination a:link, .pagination a:visited {padding:2px 5px;margin:2px;boder:1px solid #aaaadd;text-decoration:none;color:#006699;}")
                  .append(".pagination a:hover, .pagination a:active {border:1px solid #ff0000;font-weight: bold;background-color: #ff0000; color: #FFF;}")
                  .append(".pagination span.disabled {padding: 2px 5px;margin: 2px;border: 1px solid #eee; color: #ddd;}")
                  .append("</style>");
                  //自定义标签的标签体内容
                  tagContent.append("<div class='pagination'>");
                  if(this.recordCount == 0){
                      //没有查询到结果记录集，则提示没有显示数据
                    tagContent.append("<strong>没有可显示的项目</strong>/r/n");
                  }else{
                      //查询结果有显示数据时，则进行分页处理
                      tagContent.append("<form method='post' action='");
                      tagContent.append(this.getUrl());
                      tagContent.append("' name='qPagerForm'>");
                      //自定义标签的隐藏属性，用来进行页码变换时的表单数据：页码和页面大小
                      tagContent.append("<input type='hidden' name='pageNo' value='1'/>");
                      tagContent.append("<input type='hidden' name='pageSize' value='");
                      tagContent.append(this.getPageSize());
                      tagContent.append(" '/>");
                      tagContent.append("&nbsp;共<strong>");
                      tagContent.append(this.getRecordCount());
                      tagContent.append("</strong>项，<strong>");
                      //计算本次分一共有多少页：不足一页的也算作一页
                      int myPageSize = (int)Math.ceil((double)this.getRecordCount()/this.getPageSize());
                      tagContent.append(myPageSize);
                      tagContent.append("</strong>页：&nbsp;");
                      //防止页面越界的处理
                      if(this.pageNo > myPageSize){
                          this.pageNo = myPageSize;
                      }
                      if(this.pageNo < 1){
                          this.pageNo = 1;
                      }
                      //当前页为第一页时，则上一页不能显示超链接
                      if(this.pageNo == 1){
                          tagContent.append("<span class='disabled'>&laquo;&nbsp;上一页</span>");
                      }else{
                          //当前页不为第一页时，则进行页面链接处理
                          tagContent.append("<a href='javascript:turnOverPage(")
                          .append((pageNo - 1)).append(")'>&laquo;&nbsp;上一页</a>/r/n");
                      }
                      //如果前面页数过多，显示"..."
                      int start = 1;
                      if(this.pageNo > 4){
                          //在前面的页数大于4页情况下，从当前页的前一页开始显示，前面的页数使用...代替
                          start = this.pageNo - 1;
                          tagContent.append("<a herf='javascript:turnOverPage(1)'>1</a>/r/n");
                          tagContent.append("<a herf='javascript：turnOverPage(2)'>2</a>/r/n");
                          tagContent.append("&hellip;/r/n");
                      }
                      //显示当前页附近的页
                      int end = this.pageNo + 1;
                      //如果当前页为最后一页
                      if(end > myPageSize) {
                          //防止end记录的最后一页超出总页数
                          end = myPageSize;
                      }
                      for(int i = start; i <= end; i++){
                          if(pageNo ==i){
                              //当前页号不需要超链接
                            tagContent.append("<span class='current'>").append(i).append("</span>/r/n");
                          }else{
                              //当前页前后的几页需要加上超链接
                              tagContent.append("<a herf=''javascript:turnOverPage(").append(i)
                              .append(")'>").append(i).append("</a>/r/n");
                          }
                      }
                      //如果后面页数过多，显示"..." 
                     if(end < myPageSize - 2){
                         //使用...替换
                         tagContent.append("&hellip;/r/n");
                     } 
                     if(end < myPageSize - 1){
                         //刚好后面剩余页数为两页
                         tagContent.append("<a herf='javascript:turnOverPage(").append(myPageSize - 1).append(")'>")
                         .append(myPageSize - 1).append("</a>/r/n");
                     }
                     if(end < myPageSize){
                         //刚好后面的页数剩余一页
                         tagContent.append("<a herf='javascript:turnOverPage(").append(myPageSize).append(")'>").append(myPageSize).append("</a>/r/n");
                     }
                     //下一页处理
                     if(pageNo == myPageSize){
                         //如果当前页数为最后一页，则不需要超链接
                         tagContent.append("<span class='disabled'>下一页&nbsp;&raquo;").append("</span>/r/n");
                     }else{
                         //下一页的超链接可以使用
                         tagContent.append("<a herf='javascript:turnOverPage(").append((pageNo + 1)).append(")'>下一页&nbsp;&raquo;</a>/r/n");
                     }
                     tagContent.append("</from>");
                     //拼写js处理函数：当用户点击某一页时，需要将这一页的页码赋值给隐藏表单域，
                     //用来将其作为表单发送给分页响应的servlet
                     tagContent.append("<script language='javascript'>");
                     tagContent.append("function turnOverPage(no){");
                     tagContent.append("if(no>");
                     tagContent.append(myPageSize);
                     tagContent.append("){no=");
                     tagContent.append(myPageSize);
                     tagContent.append(";}");
                     tagContent.append("if(no<1){no=1;}");
                     tagContent.append("document.qPagerForm.pageNo.value=no;");
                     tagContent.append("document.qPagerForm.submit();");
                     tagContent.append("}");
                     tagContent.append("</script>");
                     tagContent.append("</div>");
                  }
                  //输出标签的内容到前台页面
                  try {
                      this.pageContext.getOut().write(tagContent.toString());
                  } catch (IOException e) {
                      //自定义标签输出错误
                     System.out.println("自定义标签输出错误：" + e.getMessage());
                  }
                  return SKIP_BODY;  
    }
    
    public int getPageNo() {
        return pageNo;
    }
    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public int getRecordCount() {
        return recordCount;
    }
    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }
    

}