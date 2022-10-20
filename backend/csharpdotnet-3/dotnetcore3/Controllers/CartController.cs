using System;
using System.Collections.Generic;
using System.Linq;
using dotnetcore3.Interfaces;
using dotnetcore3.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Logging;

namespace dotnetcore3.Controllers
{
    [ApiController]
    [Produces("application/json")]
    public class CartController : ControllerBase
    {
        private readonly ICartService _cartService;

        public CartController(ICartService cartService)
        {
            _cartService = cartService;
        }

        [Route("items")]
        [HttpGet]
        public ActionResult<ItemsResponse> GetShopItems()
        {
            return Ok(new ItemsResponse(
                new List<Product>()
                {
                    new Product("Apple", 60),
                    new Product("Orange", 25)
                }
                )
            );
        }

        [Route("total")]
        [HttpGet]
        public ActionResult<double> GetTotalPrice(string[] items)
        {
            throw new NotImplementedException();
        }
    }
}

