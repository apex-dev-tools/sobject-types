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
public class ApplicationFormChangeEvent extends SObject {
	public static SObjectType$<ApplicationFormChangeEvent> SObjectType;
	public static SObjectFields$<ApplicationFormChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public String ApplicationSummary;
	public Object ChangeEventHeader;
	public Date CompletionDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date DueDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LeadId;
	public Lead Lead;
	public String Name;
	public Id OpportunityId;
	public Opportunity Opportunity;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public Decimal Score;
	public String ScoreReason;
	public String ScoreType;
	public String Stage;
	public String SubType;
	public Date SubmissionDate;
	public String Type;
	public String UsageType;

	public ApplicationFormChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApplicationFormChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApplicationFormChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApplicationFormChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApplicationFormChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
