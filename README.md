# RestaurantReview
Project ini merupakan hasil implementasi dalam penggunaan Networking dengan Retrofit. Bahasa yang digunakan yaitu kotlin dan XML. Selain itu juga menerapkan mengenai perbedaan antara ListAdapter dengan RecylerView.Adapter
## Implementasi
1. Membuat Class RestaurantResponse untuk menampung data pengguna
2. Membuat Class ApiService dan ApiConfig untuk mengatur konfigurasi
3. Implementasi Retrofit
4. Implementasi ListAdapter
## What I Learn
1. Menggunakan RoboPojoGenerator yaitu plugin untuk mengkonnvert JSON menjadi sebuah response. Pada project ini menggunakan bahasa kotlin dengan GSON
2. Class ApiConfig berguna untuk membuat dan mengkonfigurasi retrofit. Untuk memanggil retrofit hanya memanggil ApiConfig.getApiService() sehingga tidak menulis berulang kali karena berada dalam companion object
3. Api Service berisi mengenai interface dari kumpulan endpoint dari <a href="https://restaurant-api.dicoding.dev/detail/uewq1zg2zlskfw1e867" target="_blank">Restaurant Api Dicoding</a>
4. Annotasion @POST = mengirim data, @Header = menyematkan token jika dibutuhkan otorisasi, @FormUrlEncoded = mengirim data dengan @Field
5. Fungsi enqueue = menjalankan request secara asynchronous di background
6. Perbedaan ListAdapter dan RecylerView.Adapter :
   *ListAdapter = tidak memerlukan function getItemCount( ) karena sudah diketahui list datanya melalui type parameter 1 pada ListAdapter, yaitu function submitList( ) pada Main Activity
 *RecylerView.Adapter = semua item akan diperbarui ketika ada perubahan data

