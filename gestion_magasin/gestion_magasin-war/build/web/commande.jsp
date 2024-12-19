<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Commande Page</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  <div class="container py-5">
    <h1 class="text-center mb-4">Commande Form</h1>
    <form action="/submit" method="POST" class="needs-validation" novalidate>
      <div class="mb-3">
        <label for="clientName" class="form-label">Client Name</label>
        <input type="text" class="form-control" id="clientName" name="clientName" required>
        <div class="invalid-feedback">
          Please enter the client's name.
        </div>
      </div>
      <div class="mb-3">
        <label for="address" class="form-label">Address</label>
        <textarea class="form-control" id="address" name="address" rows="3" required></textarea>
        <div class="invalid-feedback">
          Please provide an address.
        </div>
      </div>
      <button type="submit" class="btn btn-primary">Submit</button>
    </form>
  </div>
  <script>
    // Example starter JavaScript for disabling form submissions if there are invalid fields
    (function () {
      const forms = document.querySelectorAll('.needs-validation')
      Array.from(forms).forEach(function (form) {
        form.addEventListener('submit', function (event) {
            event.preventDefault()
          if (!form.checkValidity()) {
            event.stopPropagation()
          }
          form.classList.add('was-validated')
        }, false)
      })
    })()
  </script>
</body>
</html>
