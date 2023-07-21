document.addEventListener("DOMContentLoaded", () => {
  const list_table = document.querySelector("table.main.list");
  const trClickHander = (e) => {
    const td = e.target;

    if (td.tagName === "TD") {
      const tr = td.closest("TR");

      // data-id 속성에 설정된 값을 가져오기
      const id = tr.dataset.id;

      document.location.href = `${rootPath}/user/detail?id=${id}`;
    }
  };
  list_table?.addEventListener("click", trClickHander);
});
