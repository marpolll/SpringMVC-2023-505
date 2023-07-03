document.addEventListener("DOMContentLoaded", () => {
  const main_nav = document.querySelector("nav.main");
  const navClickHandler = (e) => {
    const nav_item = e.target;
    if (nav_item.tagName === "LI") {
      const nav_class = nav_item.className;
      const nav_classList = nav_item.classList;

      let location = `${rootPath}`;

      console.log("className", nav_class);
      if (nav_class === "home") {
        location += "/";

        // nav_item 에 user 라는 클래스가 있으면
        /*
            class="user login" 이라면
            /user/login 이라는 location 을 만들고

            class="user join" 이라면
            /user/join 이라는 location 을 만들어라
            
        */
      } else if (nav_classList.contains("user")) {
        location += `/user/${nav_classList[1]}`;
      } else if (nav_class === "admin") {
        location += "/admin";
      }
      console.log("location", location);

      /*
    if (nav_item.tagName === "LI") {
      const nav_class = nav_item.className;
      if (nav_class === "home") {
        location += `/`;
      } else if (nav_class === "login") {
        location += `/user/login`;
      } else if (nav_class === "join") {
        location += `/user/join`;
      } else if (nav_class === "mypage") {
        location += `/user/mypage`;
      } else if (nav_class === "logout") {
        location += `/user/loout`;
      } else if (nav_class === "admin") {
        location += `/admin`;
      } else {
        location += "/";
      }
      */
      document.location.href = location;
    }
  };
  main_nav?.addEventListener("click", navClickHandler);
});
