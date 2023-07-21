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
      } else if (nav_class === "user") {
        location += "/user";
      } else if (nav_classList.contains("user")) {
        location += `/user/${nav_classList[1]}`;
      } else if (nav_class === "admin") {
        location += "/admin";
      }
      console.log("location", location);

      document.location.href = location;
    }
  };
  main_nav?.addEventListener("click", navClickHandler);
});
