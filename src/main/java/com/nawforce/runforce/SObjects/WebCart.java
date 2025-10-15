/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class WebCart extends SObject {
	public static SObjectType$<WebCart> SObjectType;
	public static SObjectFields$<WebCart> Fields;

	public Id AccountId;
	public Name Account;
	public Address BillingAddress;
	public String BillingCity;
	public String BillingCountry;
	public String BillingCountryCode;
	public String BillingGeocodeAccuracy;
	public Decimal BillingLatitude;
	public Decimal BillingLongitude;
	public String BillingPostalCode;
	public String BillingState;
	public String BillingStateCode;
	public String BillingStreet;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal GrandTotalAmount;
	public String GuestCompanyName;
	public String GuestEmailAddress;
	public String GuestFirstName;
	public String GuestLastName;
	public String GuestPhoneNumber;
	public String GuestSecondName;
	public Id Id;
	public String InitialOrderReferenceNumber;
	public String InventoryReservationIdentifier;
	public Boolean IsDeleted;
	public Boolean IsRepricingNeeded;
	public Boolean IsSecondary;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastRepricingDate;
	public String Name;
	public Id OrderOwnerId;
	public User OrderOwner;
	public Id OwnerId;
	public Name Owner;
	public Id PaymentGroupId;
	public PaymentGroup PaymentGroup;
	public Id PaymentMethodId;
	public Name PaymentMethod;
	public String PoNumber;
	public String Status;
	public Datetime SystemModstamp;
	public String TaxType;
	public Decimal TotalAdjustmentAmount;
	public Decimal TotalAmount;
	public Decimal TotalAmountAfterAllAdjustments;
	public Decimal TotalCartLevelAdjAmount;
	public Decimal TotalChargeAmount;
	public Decimal TotalChargeItemAdjAmount;
	public Decimal TotalChargeTaxAmount;
	public Integer TotalLineItemsWithErrors;
	public Decimal TotalListAmount;
	public Decimal TotalProductAmount;
	public Decimal TotalProductCount;
	public Decimal TotalProductItemAdjAmount;
	public Integer TotalProductLineItemCount;
	public Decimal TotalProductListAmount;
	public Decimal TotalProductTaxAmount;
	public Decimal TotalPromoAdjustmentAmount;
	public Decimal TotalPromoAdjustmentTaxAmount;
	public Decimal TotalTaxAmount;
	public String Type;
	public Integer UniqueProductCount;
	public Id WebStoreId;
	public WebStore WebStore;

	public AppUsageAssignment[] AppUsageAssignments;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public CartCheckoutSession[] CartCheckoutSessions;
	public WebCartCredit[] CartCredits;
	public CartDeliveryGroup[] CartDeliveryGroups;
	public CartItemPriceAdjustment[] CartItemPriceAdjustments;
	public CartTax[] CartItemTaxes;
	public CartItem[] CartItems;
	public CartDeliveryGroupMethod[] CartShippingOptions;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public WebCartHistory[] Histories;
	public InventoryReservation[] InventoryReservations;
	public ProcessException[] ProcessExceptions;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public WebCartShare[] Shares;
	public CartValidationOutput[] WebCart;
	public WebCartAdjustmentBasis[] WebCartAdjustmentBases;
	public WebCartAdjustmentGroup[] WebCartAdjustmentGroups;

	public WebCart clone$() {throw new java.lang.UnsupportedOperationException();}
	public WebCart clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WebCart clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WebCart clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WebCart clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
