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
public class ApplicationFormChangeEvent extends SObject {
	public static SObjectType$<ApplicationFormChangeEvent> SObjectType;
	public static SObjectFields$<ApplicationFormChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public String ApplicationStatus;
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
	public String Purpose;
	public Id ReferenceRecordId;
	public Benefit ReferenceRecord;
	public String ReplayId;
	public Decimal Score;
	public String ScoreReason;
	public String ScoreType;
	public String Stage;
	public String SubType;
	public Date SubmissionDate;
	public Id SubmittedById;
	public SObject SubmittedBy;
	public String Title;
	public String Type;
	public String UsageType;

	public ApplicationFormChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApplicationFormChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApplicationFormChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApplicationFormChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApplicationFormChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
