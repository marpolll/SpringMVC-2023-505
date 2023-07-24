document.addEventListener("DOMContentLoaded", () => {
  const input_title = document.querySelector("#sTitle");
  const input_sdate = document.querySelector("#startDate");
  const input_edate = document.querySelector("#endDate");
  const input_sbg = document.querySelector("#sBg");

  const btn_save = document.querySelector("#btn_save");

  btn_save?.addEventListener("click", () => {
    document.querySelector("schedule_form").submit();
    return false;
  });
});
