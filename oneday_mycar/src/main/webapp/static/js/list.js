document.addEventListener("DOMContentLoaded", () => {
  const list_table = document.querySelector("table.main.list");

  const trClickHander = (e) => {
    const td = e.target;

    if (td.tagName === "TD") {
      const tr = td.closest("TR");

      const id = tr.dataset.id;

      document.location.href = `${rootPath}/detail?c_no=${id}`;
    }
  };
  list_table?.addEventListener("click", trClickHander);
});
