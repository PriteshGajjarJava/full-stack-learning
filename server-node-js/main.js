const express = require('express')
const cors = require('cors')
const app = express()
let mysql = require('mysql');

app.use(cors({
  methods: ['GET','POST','DELETE','UPDATE','PUT','PATCH']
}));

app.use(cors({
  origin: '*'
}));


app.get('/hello', function (req, res) {
  res.send('<h2>Hello World</h2>')
})
app.get('/student', function (req, res) {
  let id = req.query.id;
  let name = req.query.name;
  let marks = req.query.marks;
  var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'root',
  password : 'root',
  database : 'college'
  });
 
  connection.connect();
  // insert into student values(1, 'abc', 90);
  var sql = "INSERT INTO student VALUES (" + id +  ",'"  + name + "'," + marks +");";
  console.log(sql);
  connection.query(sql, function (err, result) {
    if (err) throw err;
    console.log("1 record inserted");
  });
  res.send('<h4>Saved successfully</h4>');
})

app.listen(3000)
