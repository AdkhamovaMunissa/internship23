import http from "../http-common";

class ProductDataService {
  getAll() {
    return http.get("/product_lines");
  }

//   get(id) {
//     return http.get(`/users/${id}`);
//   }

//   create(data) {
//     return http.post("/users", data);
//   }

//   update(id, data) {
//     return http.put(`/users/${id}`, data);
//   }

//   delete(id) {
//     return http.delete(`/users/${id}`);
//   }

//   deleteAll() {
//     return http.delete(`/users`);
//   }

//   findByTitle(title) {
//     return http.get(`/users?title=${title}`);
//   }
}

export default new ProductDataService();