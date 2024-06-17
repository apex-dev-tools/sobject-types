/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
