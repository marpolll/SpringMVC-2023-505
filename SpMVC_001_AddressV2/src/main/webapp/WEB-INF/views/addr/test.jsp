<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
   <title>일정보기</title>
    <link rel="stylesheet" href="./css/calendar.css" />
    <link rel="stylesheet" href="./css/sidebar.css">
    <link href="${rootPath}/static/css/test.css?20230628-002" rel="stylesheet"/>
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css?family=Sofia&effect=fire"
    />
    <script
      src="https://kit.fontawesome.com/3aaa5e7779.js"
      crossorigin="anonymous"
    ></script>
  </head>
  <body>
    <div class="section">
      <div class="container">
        <div class="row full-height justify-content-center">
          <div class="col-12 text-center align-self-center py-5">
            <div class="section pb-5 pt-5 pt-sm-2 text-center">
              <!-- <div id="godlife" class="title font-effect-fire">갓생살기</div> -->
                <h6 class="mb-0 pb-3"><span>일정 </span><span>챌린지</span></h6>
                <input
                  class="checkbox"
                  type="checkbox"
                  id="reg-log"
                  name="reg-log"
                />
                <label for="reg-log"></label>
                <section class="yearmonth">
                <div class="year">2023</div>
              </section>
              <!-- <section class="yearmonth2">
                <div class="month">6월</div>
              </section> -->
              <div class="card-3d-wrap mx-auto">
                <div class="card-3d-wrapper">
                  <div class="card-front">
                    <div class="center-wrap">
                      <div class="section text-center">
                        <h4 class="mb-4 pb-3">6월</h4>
                        <div class="form-group">
                          <!-- <section> -->
                            <div class="calendar">
                                <div class="calendar-day1">일</div>  
                              <div class="calendar-day1">월</div>
                              <div class="calendar-day1">화</div>
                              <div class="calendar-day1">수</div>
                              <div class="calendar-day1">목</div>
                              <div class="calendar-day1">금</div>
                              <div class="calendar-day1">토</div>
                              <div class="calendar-day3">28</div>
                              <div class="calendar-day3">29</div>
                              <div class="calendar-day3">30</div>
                              <div class="calendar-day3">31</div>
                              <div class="calendar-day">1</div>
                              <div class="calendar-day">2</div>
                              <div class="calendar-day">3</div>
                              <div class="calendar-day">
                                4
                                <div class="schedule"><input type="checkbox"></input>회식</div>
                              </div>
                              <div class="calendar-day">5</div>
                              <div class="calendar-day">6</div>
                              <div class="calendar-day">7</div>
                              <div class="calendar-day">8</div>
                              <div class="calendar-day">9</div>
                              <div class="calendar-day">10</div>
                              <div class="calendar-day">11</div>
                              <div class="calendar-day">12</div>
                              <div class="calendar-day">13</div>
                              <div class="calendar-day">14</div>
                              <div class="calendar-day">
                                15
                                <div class="schedule"><input type="checkbox"></input> 백화점</div>
                              </div>
                              <div class="calendar-day">16</div>
                              <div class="calendar-day">17</div>
                              <div class="calendar-day">18</div>
                              <div class="calendar-day">19</div>
                              <div class="calendar-day">20</div>
                              <div class="calendar-day">21</div>
                              <div class="calendar-day">22</div>
                              <div class="calendar-day">23</div>
                              <div class="calendar-day">24</div>
                              <div class="calendar-day">
                                25
                                <div class="schedule"><input type="checkbox"></input> 월급</div>
                              </div>
                              <div class="calendar-day">26</div>
                              <div class="calendar-day">
                                27
                                <div class="schedule"><input type="checkbox"></input> 발표</div>
                              </div>
                              <div class="calendar-day">28</div>
                              <div class="calendar-day">29</div>
                              <div class="calendar-day">30</div>
                              <div class="calendar-day3">1</div>
                    

                            </div>
                            </div>
                          <!-- </section> -->
                        <p class="mb-0 mt-4 text-center"></p>
                      </div>
                    </div>
                  </div>
                  <div class="card-back">
                    <div class="center-wrap">
                      <div class="section text-center">
                        <h4 class="mb-4 pb-3">6월</h4>
                        <div class="form-group">
                            <!-- <section> -->
                                <div class="calendar">
                                  <div class="calendar-day1">일</div>
                                  <div class="calendar-day1">월</div>
                                  <div class="calendar-day1">화</div>
                                  <div class="calendar-day1">수</div>
                                  <div class="calendar-day1">목</div>
                                  <div class="calendar-day1">금</div>
                                  <div class="calendar-day1">토</div>
                                  <div class="calendar-day3">28</div>
                                  <div class="calendar-day3">29</div>
                                  <div class="calendar-day3">30</div>
                                  <div class="calendar-day3">31</div>
                                  <div class="calendar-day">1</div>
                                  <div class="calendar-day">2</div>
                                  <div class="calendar-day">3</div>
                                  <div class="calendar-day">4</div>
                                  <div class="calendar-day">5</div>
                                  <div class="calendar-day">6</div>
                                  <div class="calendar-day">7</div>
                                  <div class="calendar-day">8</div>
                                  <div class="calendar-day">9</div>
                                  <div class="calendar-day">10</div>
                                  <div class="calendar-day">11</div>
                                  <div class="calendar-day">12</div>
                                  <div class="calendar-day">13</div>
                                  <div class="calendar-day">14</div>
                                  <div class="calendar-day">
                                    15
                                    <div class="graph1"></div>
                                    <div class="schedule">독서</div>
                                  </div>
                                  <div class="calendar-day">16 <div class="graph1"></div> </div>
                                  <div class="calendar-day">17 <div class="graph1"></div></div>
                                  <div class="calendar-day">18 <div class="graph1"></div></div>
                                  <div class="calendar-day">19 <div class="graph1"></div></div>
                                  <div class="calendar-day">20 <div class="graph1"></div></div>
                                  <div class="calendar-day">21 <div class="graph1"></div></div>
                                  <div class="calendar-day">22</div>
                                  <div class="calendar-day">23</div>
                                  <div class="calendar-day">24</div>
                                  <div class="calendar-day">25</div>
                                  <div class="calendar-day">26</div>
                                  <div class="calendar-day">27
                                    <div class="graph2"></div>
                                    <div class="schedule">런닝하기</div>
                                  </div>
                                  <div class="calendar-day">28<div class="graph2"></div></div>
                                  <div class="calendar-day">29<div class="graph2"></div></div>
                                  <div class="calendar-day">30<div class="graph2"></div></div>
                                  <div class="calendar-day3">1<div class="graph2"></div></div>
                                </div>
                              <!-- </section> -->
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
