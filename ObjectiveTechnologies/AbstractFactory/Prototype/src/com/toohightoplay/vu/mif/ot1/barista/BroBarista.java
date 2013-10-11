package com.toohightoplay.vu.mif.ot1.barista;

import com.toohightoplay.vu.mif.ot1.products.Beer;
import com.toohightoplay.vu.mif.ot1.products.GrinbergenBeer;
import com.toohightoplay.vu.mif.ot1.products.Meal;
import com.toohightoplay.vu.mif.ot1.products.SloppyJoe;
import com.toohightoplay.vu.mif.ot1.products.Snacks;
import com.toohightoplay.vu.mif.ot1.products.Taco;

/**
 * 
 * @author TooHighToPlay
 *
 */
public class BroBarista extends Barista{

	@Override
	public Beer serveBeer() {
		
		if (beer == null) {
			beer = new GrinbergenBeer();
		}
		
		return beer.clone();
	}

	@Override
	public Meal serveMeal() {
		
		if (meal == null) {
			meal = new SloppyJoe();
		}
		
		return meal.clone();
	}

	@Override
	public Snacks serveSnacks() {
		
		if (snacks == null) {
			snacks = new Taco();
		}
		
		return snacks.clone();
	}

}
