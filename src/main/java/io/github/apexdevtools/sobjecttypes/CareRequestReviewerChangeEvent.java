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
public class CareRequestReviewerChangeEvent extends SObject {
	public static SObjectType$<CareRequestReviewerChangeEvent> SObjectType;
	public static SObjectFields$<CareRequestReviewerChangeEvent> Fields;

	public Id CareRequestCaseId;
	public Case CareRequestCase;
	public Id CareRequestReferenceId;
	public SObject CareRequestReference;
	public Object ChangeEventHeader;
	public Id ContentDocumentId;
	public ContentDocument ContentDocument;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;
	public Datetime ReviewDate;
	public Id ReviewerId;
	public SObject Reviewer;
	public String ReviewerNotes;
	public String ReviewerType;
	public String Status;

	public CareRequestReviewerChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareRequestReviewerChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestReviewerChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestReviewerChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareRequestReviewerChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
