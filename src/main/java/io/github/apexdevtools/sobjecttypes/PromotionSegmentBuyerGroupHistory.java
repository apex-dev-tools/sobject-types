/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class PromotionSegmentBuyerGroupHistory extends SObject {
	public static SObjectType$<PromotionSegmentBuyerGroupHistory> SObjectType;
	public static SObjectFields$<PromotionSegmentBuyerGroupHistory> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String Division;
	public String Field;
	public Id Id;
	public Boolean IsDeleted;
	public Object NewValue;
	public Object OldValue;
	public Id PromotionSegmentBuyerGroupId;
	public PromotionSegmentBuyerGroup PromotionSegmentBuyerGroup;

	public PromotionSegmentBuyerGroupHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public PromotionSegmentBuyerGroupHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PromotionSegmentBuyerGroupHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PromotionSegmentBuyerGroupHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PromotionSegmentBuyerGroupHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
