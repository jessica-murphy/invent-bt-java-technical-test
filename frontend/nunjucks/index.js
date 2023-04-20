// index.js

/**
 * Required External Modules
 */
const express = require("express");
const path = require("path");
const nunjucks = require("nunjucks");
const bodyParser = require('body-parser')

/**
 * App Variables
 */
const app = express();
const port = process.env.PORT || "8000";

/**
 *  App Configuration
 */
app.use(express.static(path.join(__dirname, "public")));
app.use(bodyParser.urlencoded({ extended: true }));

nunjucks.configure(path.join(__dirname, "views"), {
    autoescape: true,
    noCache: true,
    express: app
});

/**
 * Routes Definitions
 */
app.get("/", async (req, res) => {
    res.render("index.njk");
});
app.post('/', (req, res) => {
    console.log(req.body)
    const { name } = req.body || {};

    res.locals.name = name;
    res.render("hello.njk");
})

/**
 * Server Activation
 */
app.listen(port, () => {
    console.log(`Listening to requests on http://localhost:${port}`);
});