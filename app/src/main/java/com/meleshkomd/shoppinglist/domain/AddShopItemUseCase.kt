package com.meleshkomd.shoppinglist.domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopList(shopItem: ShopItem) {
        shopListRepository.addShopList(shopItem)
    }
}