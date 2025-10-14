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
public class IndividualApplicationChangeEvent extends SObject {
	public static SObjectType$<IndividualApplicationChangeEvent> SObjectType;
	public static SObjectFields$<IndividualApplicationChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal AmountPaid;
	public Id ApplicationCaseId;
	public Case ApplicationCase;
	public String ApplicationCategory;
	public String ApplicationReferenceNumber;
	public String ApplicationType;
	public Datetime AppliedDate;
	public Datetime ApprovedDate;
	public Id BudgetId;
	public Budget Budget;
	public Id BusinessTypeId;
	public BusinessType BusinessType;
	public String Category;
	public Object ChangeEventHeader;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String ExternalProject;
	public Id HealthcareProviderId;
	public HealthcareProvider HealthcareProvider;
	public Id Id;
	public Boolean IsApprovalRequired;
	public Boolean IsOwnerEditable;
	public Boolean IsSubmittedByThirdParty;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LicensePermitNameId;
	public BusinessLicense LicensePermitName;
	public Id LicenseTypeId;
	public RegulatoryAuthorizationType LicenseType;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ParentApplicationId;
	public IndividualApplication ParentApplication;
	public Datetime PaymentDate;
	public String RejectionReason;
	public String ReplayId;
	public Datetime RequirementsCompleteDate;
	public Id SavedApplicationRefId;
	public PreliminaryApplicationRef SavedApplicationRef;
	public String ServiceType;
	public String Status;
	public Id SubmittedByAccountId;
	public Account SubmittedByAccount;
	public Id SubmittedByContactId;
	public Contact SubmittedByContact;
	public Boolean WasReturned;

	public IndividualApplicationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public IndividualApplicationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IndividualApplicationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IndividualApplicationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IndividualApplicationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
