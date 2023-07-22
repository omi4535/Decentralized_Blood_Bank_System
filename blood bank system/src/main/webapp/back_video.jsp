<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Background Video</title>
  <style>
    body {
      margin: 0;
      padding: 0;
      overflow: hidden;
    }

    #video-background {
      position: fixed;
      right: 0;
      bottom: 0;
    
      min-width: 100%;
      min-height: 100%;
      width: auto;
      height: auto;
      object-fit: cover;
      z-index: -100;
    }

    #video-content {
      position: relative;
      z-index: 1;
      color: #ffffff;
      text-align: center;
      padding: 20px;
    }
  </style>
</head>
<body>
 
  <video id="video-background" autoplay loop muted>
 <source src="<%=request.getContextPath()%>/vidoes/homevideo1.mp4" type="video/mp4">
    <p>Your browser does not support the video tag.</p>
  </video>
 <!--   <div id="video-content">
    <!-- Your page content goes here 
    <h1>Welcome to my website</h1>
    <p>This is an example of using a video as the background.</p>
  </div>
  
  -->
 
    
</body>

</html>

