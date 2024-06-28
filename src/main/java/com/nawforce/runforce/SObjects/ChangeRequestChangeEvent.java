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
public class ChangeRequestChangeEvent extends SObject {
	public static SObjectType$<ChangeRequestChangeEvent> SObjectType;
	public static SObjectFields$<ChangeRequestChangeEvent> Fields;

	public String BusinessJustification;
	public String BusinessReason;
	public String Category;
	public Object ChangeEventHeader;
	public String ChangeRequestNumber;
	public String ChangeType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Datetime EstimatedEndTime;
	public Datetime EstimatedStartTime;
	public Datetime FinalReviewDateTime;
	public String FinalReviewNotes;
	public Id Id;
	public String Impact;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OwnerId;
	public User Owner;
	public String Priority;
	public String RemediationPlan;
	public String ReplayId;
	public Id ReviewerId;
	public User Reviewer;
	public String RiskImpactAnalysis;
	public String RiskLevel;
	public String Status;
	public String Subject;

	public ChangeRequestChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ChangeRequestChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ChangeRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ChangeRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ChangeRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
