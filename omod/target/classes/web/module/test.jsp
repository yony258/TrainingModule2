<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>

<%@ include file="template/localHeader.jsp"%>

<%@ taglib prefix="springform" uri="/WEB-INF/taglibs/spring-form.tld" %>

<form:form method="post" commandName = "conceptname">
Enter Concept ID: <input type="text" />
<P><INPUT TYPE="SUBMIT" value="Search">
</form:form>

<%@ include file="/WEB-INF/template/footer.jsp"%>