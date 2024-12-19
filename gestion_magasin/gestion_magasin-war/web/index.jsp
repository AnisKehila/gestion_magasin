<!-- index.html -->
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Product Listing</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  <div class="container py-5">
    <h1 class="text-center mb-4">Product Listing</h1>
    <div class="row row-cols-1 row-cols-md-4 g-4">
      <!-- Loop for Products -->
      <!-- Repeat this block for each product -->
      <div class="col">
        <div class="card h-100">
          <svg class="bd-placeholder-img card-img-top" width="100%" height="180" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder" preserveAspectRatio="xMidYMid slice" focusable="false">
            <rect width="100%" height="100%" fill="#e9ecef"></rect>
            <text x="50%" y="50%" fill="#adb5bd" dy=".3em" text-anchor="middle">Image</text>
          </svg>
          <div class="card-body">
            <h5 class="card-title">Product Name</h5>
            <p class="card-text">Brief description of the product.</p>
          </div>
          <div class="card-footer text-center">
            <a href="commande.jsp" class="btn btn-primary">Buy</a>
          </div>
        </div>
      </div>
      <!-- End Repeat -->
    </div>
  </div>
</body>
</html>