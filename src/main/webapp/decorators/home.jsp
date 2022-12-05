<%--
  Created by IntelliJ IDEA.
  User: hoang
  Date: 04/12/2022
  Time: 1:41 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/common/tablig.jsp"%>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="TemplateMo">
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i&display=swap" rel="stylesheet">

    <title>Stand CSS Blog by TemplateMo</title>

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/template/web/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">


    <!-- Additional CSS Files -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/template/web/assets/css/fontawesome.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/template/web/assets/css/templatemo-stand-blog.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/template/web/assets/css/owl.css">
    <!--

    TemplateMo 551 Stand Blog

    https://templatemo.com/tm-551-stand-blog

    -->
</head>

<body>

<!-- ***** Preloader Start ***** -->
<div id="preloader">
    <div class="jumper">
        <div></div>
        <div></div>
        <div></div>
    </div>
</div>
<!-- ***** Preloader End ***** -->

<!-- Header -->
<%@ include file="/common/web/header.jsp"%>

<!-- Page Content -->
<!-- Banner Starts Here -->
<decorator:body />

<!-- footer -->
<%@ include file="/common/web/footer.jsp"%>

<!-- Bootstrap core JavaScript -->
<script src="${pageContext.request.contextPath}/template/web/vendor/jquery/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/template/web/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Additional Scripts -->
<script src="${pageContext.request.contextPath}/template/web/assets/js/custom.js"></script>
<script src="${pageContext.request.contextPath}/template/web/assets/js/owl.js"></script>
<script src="${pageContext.request.contextPath}/template/web/assets/js/slick.js"></script>
<script src="${pageContext.request.contextPath}/template/web/assets/js/isotope.js"></script>
<script src="${pageContext.request.contextPath}/template/web/assets/js/accordions.js"></script>

<script language = "text/Javascript">
    cleared[0] = cleared[1] = cleared[2] = 0; //set a cleared flag for each field
    function clearField(t){                   //declaring the array outside of the
        if(! cleared[t.id]){                      // function makes it static and global
            cleared[t.id] = 1;  // you could use true and false, but that's more typing
            t.value='';         // with more chance of typos
            t.style.color='#fff';
        }
    }
</script>

</body>
</html>