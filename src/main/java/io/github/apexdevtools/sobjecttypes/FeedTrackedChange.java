/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class FeedTrackedChange extends SObject {
	public static SObjectType$<FeedTrackedChange> SObjectType;
	public static SObjectFields$<FeedTrackedChange> Fields;

	public String CurrencyIsoCode;
	public Id FeedItemId;
	public SObject FeedItem;
	public String FieldName;
	public Id Id;
	public Object NewValue;
	public String OldCurrencyIsoCode;
	public Object OldValue;

	public FeedTrackedChange clone$() {throw new java.lang.UnsupportedOperationException();}
	public FeedTrackedChange clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FeedTrackedChange clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FeedTrackedChange clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FeedTrackedChange clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
