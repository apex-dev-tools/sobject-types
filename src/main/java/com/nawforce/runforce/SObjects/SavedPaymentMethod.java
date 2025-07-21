/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class SavedPaymentMethod extends SObject {
	public static SObjectType$<SavedPaymentMethod> SObjectType;
	public static SObjectFields$<SavedPaymentMethod> Fields;

	public String AccountHolderEmail;
	public String AccountHolderName;
	public String BankAccountHolderType;
	public String BankAccountType;
	public String BankCode;
	public String BankName;
	public Address BillingAddress;
	public String BillingCity;
	public String BillingCountry;
	public String BillingGeocodeAccuracy;
	public Decimal BillingLatitude;
	public Decimal BillingLongitude;
	public String BillingPostalCode;
	public String BillingState;
	public String BillingStreet;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Integer ExpiryMonth;
	public Integer ExpiryYear;
	public String GatewayReference;
	public Blob GatewayToken;
	public Id Id;
	public Boolean IsDefault;
	public Boolean IsDeleted;
	public Boolean IsMerchantCreated;
	public Boolean IsSharedWithinSameAccount;
	public String Issuer;
	public String Last4;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id MerchantAccountId;
	public MerchantAccount MerchantAccount;
	public String Name;
	public String Network;
	public String NickName;
	public Id PaymentGatewayId;
	public PaymentGateway PaymentGateway;
	public Id ReferenceOwnerId;
	public Name ReferenceOwner;
	public String StandardEntryClassCode;
	public String Status;
	public Datetime SystemModstamp;
	public String Type;
	public String UsageType;

	public AlternativePaymentMethod[] AlternativePaymentMethods;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public CardPaymentMethod[] CardPaymentMethods;
	public DigitalWallet[] DigitalWallets;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public SavedPaymentMethod clone$() {throw new java.lang.UnsupportedOperationException();}
	public SavedPaymentMethod clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SavedPaymentMethod clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SavedPaymentMethod clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SavedPaymentMethod clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
