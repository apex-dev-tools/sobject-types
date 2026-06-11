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
public class InsuranceRatingRequestEvent extends SObject {
	public static SObjectType$<InsuranceRatingRequestEvent> SObjectType;
	public static SObjectFields$<InsuranceRatingRequestEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ErrorCode;
	public String ErrorMessage;
	public String EventUuid;
	public Id RatingRequestId;
	public InsuranceRatingRequest RatingRequest;
	public String ReplayId;
	public String RequestStatus;

	public InsuranceRatingRequestEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsuranceRatingRequestEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceRatingRequestEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceRatingRequestEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceRatingRequestEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
