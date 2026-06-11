/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ContentVersionRating extends SObject {
	public static SObjectType$<ContentVersionRating> SObjectType;
	public static SObjectFields$<ContentVersionRating> Fields;

	public Id ContentVersionId;
	public ContentVersion ContentVersion;
	public Id Id;
	public Datetime LastModifiedDate;
	public Integer Rating;
	public String UserComment;
	public Id UserId;
	public User User;

	public ContentVersionRating clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionRating clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionRating clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionRating clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionRating clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
