/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class SfdcPartnerSbscrOffer extends SObject {
	public static SObjectType$<SfdcPartnerSbscrOffer> SObjectType;
	public static SObjectFields$<SfdcPartnerSbscrOffer> Fields;

	public String BillingFrequency;
	public Integer ContractTerm;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Address CustBillingAddress;
	public String CustBillingCity;
	public String CustBillingCountry;
	public String CustBillingCountryCode;
	public String CustBillingGeocodeAccuracy;
	public Decimal CustBillingLatitude;
	public Decimal CustBillingLongitude;
	public String CustBillingPostalCode;
	public String CustBillingState;
	public String CustBillingStateCode;
	public String CustBillingStreet;
	public Address CustShippingAddress;
	public String CustShippingCity;
	public String CustShippingCountry;
	public String CustShippingCountryCode;
	public String CustShippingGeocodeAccuracy;
	public Decimal CustShippingLatitude;
	public Decimal CustShippingLongitude;
	public String CustShippingPostalCode;
	public String CustShippingState;
	public String CustShippingStateCode;
	public String CustShippingStreet;
	public String CustomerBillingEmailAddress;
	public String CustomerEmailAddress;
	public String CustomerName;
	public String CustomerPaymentTerms;
	public String CustomerPurchaseOrderNumber;
	public Date ExpirationDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String OfferType;
	public Integer OrderPrebillDays;
	public String PartnerCompanyName;
	public String PartnerOffer;
	public String PartnerOrg;
	public String PaymentMethod;
	public Id RespondingUserId;
	public User RespondingUser;
	public Date ServiceEndDate;
	public Date ServiceStartDate;
	public Decimal ServiceTerm;
	public String Status;
	public Decimal SubTotal;
	public String SyncToPboError;
	public Datetime SyncToPboLastUpdate;
	public String SyncToPboStatus;
	public Datetime SystemModstamp;
	public String TermsAndConditions;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public SfdcPartnerSbscrOfferHistory[] Histories;
	public SfdcPartnerSbscrOfferItem[] PartnerSubscriberOfferItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public SfdcPartnerSbscrOfferShare[] Shares;

	public SfdcPartnerSbscrOffer clone$() {throw new java.lang.UnsupportedOperationException();}
	public SfdcPartnerSbscrOffer clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SfdcPartnerSbscrOffer clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SfdcPartnerSbscrOffer clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SfdcPartnerSbscrOffer clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
