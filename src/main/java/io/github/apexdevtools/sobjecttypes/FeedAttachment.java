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
public class FeedAttachment extends SObject {
	public static SObjectType$<FeedAttachment> SObjectType;
	public static SObjectFields$<FeedAttachment> Fields;

	public Id FeedEntityId;
	public SObject FeedEntity;
	public Id Id;
	public Boolean IsDeleted;
	public Id RecordId;
	public SObject Record;
	public String Title;
	public String Type;
	public String Value;

	public FeedAttachment clone$() {throw new java.lang.UnsupportedOperationException();}
	public FeedAttachment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FeedAttachment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FeedAttachment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FeedAttachment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
