package com.example.clothesshopremake.repository.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.clothesshopremake.entity.CategoryRepo;
import com.example.clothesshopremake.entity.ProductStatusRepo;
import com.example.clothesshopremake.repository.AccountBagRepo;
import com.example.clothesshopremake.repository.AccountRepo;
import com.example.clothesshopremake.repository.AccountShipContactRepo;
import com.example.clothesshopremake.repository.AccountStatusRepo;
import com.example.clothesshopremake.repository.BillDetailRepo;
import com.example.clothesshopremake.repository.BillRepo;
import com.example.clothesshopremake.repository.BillSalesRepo;
import com.example.clothesshopremake.repository.BrandRepo;
import com.example.clothesshopremake.repository.BuyMethodRepo;
import com.example.clothesshopremake.repository.ColorRepo;
import com.example.clothesshopremake.repository.ProducerRepo;
import com.example.clothesshopremake.repository.ProductImgRepo;
import com.example.clothesshopremake.repository.ProductRepo;
import com.example.clothesshopremake.repository.RoleRepo;
import com.example.clothesshopremake.repository.SaleRepo;
import com.example.clothesshopremake.repository.ShipMethodRepo;
import com.example.clothesshopremake.repository.SizeRepo;

@Service
public class Dbcontext {
	@Autowired
    public AccountRepo accountRepo;
    @Autowired
    public AccountStatusRepo accountStatusRepo;
    @Autowired
    public AccountBagRepo accountBagRepo;
    @Autowired
    public AccountShipContactRepo accountShipContactRepo;
    @Autowired
    public BuyMethodRepo buyMethodRepo;
    @Autowired
    public ProductRepo productRepo;
    @Autowired
    public RoleRepo roleRepo;
    @Autowired
    public SaleRepo salesRepo;
    @Autowired
    public ShipMethodRepo shipMethodRepo;
    @Autowired
    public BillRepo billRepo;
    @Autowired
    public BillDetailRepo billDetailRepo;
    @Autowired
    public BillSalesRepo billSalesRepo;
    @Autowired
    public ColorRepo colorRepo;
    @Autowired
    public BrandRepo brandRepo;
    @Autowired
    public ProducerRepo producerRepo;
    @Autowired
    public SizeRepo sizeRepo;
    @Autowired
    public ProductImgRepo productImgRepo;
    @Autowired
    public CategoryRepo categoryRepo;
    @Autowired
    public ProductStatusRepo productStatusRepo;
}
