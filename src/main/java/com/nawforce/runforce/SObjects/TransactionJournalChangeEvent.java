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
public class TransactionJournalChangeEvent extends SObject {
	public static SObjectType$<TransactionJournalChangeEvent> SObjectType;
	public static SObjectFields$<TransactionJournalChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public String AccountingModelConfigName;
	public Datetime ActivityDate;
	public String BookedFareClass;
	public String BookedRoomType;
	public Date BookingDate;
	public String Brand;
	public Object ChangeEventHeader;
	public String Channel;
	public String Comment;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Destination;
	public Decimal Distance;
	public Date DueDate;
	public Datetime EndDate;
	public String ErrorDescription;
	public Date EscrowPointsCreditDate;
	public String Establishment;
	public String ExternalTransactionNumber;
	public String FlightNumber;
	public String FundAccountRecordIdValue;
	public String FundAccountValue;
	public String GeneralLedgerCode;
	public Id Id;
	public String Industry;
	public Date InvoiceDate;
	public Boolean IsAccrualJournalEntry;
	public Boolean IsAdjustmentJournalEntry;
	public Boolean IsHistoricalJournalEntry;
	public Boolean IsRelatedJournalEntry;
	public Boolean IsWriteOffJournalEntry;
	public Datetime JournalDate;
	public String JournalReason;
	public Id JournalSubTypeId;
	public JournalSubType JournalSubType;
	public Id JournalTypeId;
	public JournalType JournalType;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoyaltyProgramId;
	public LoyaltyProgram LoyaltyProgram;
	public Id MemberId;
	public LoyaltyProgramMember Member;
	public String Name;
	public Id OrderId;
	public Order Order;
	public Id OrderItemId;
	public OrderItem OrderItem;
	public String Origin;
	public Id PartnerId;
	public LoyaltyProgramPartner Partner;
	public Date PaymentDate;
	public String PaymentMethod;
	public String PrimaryRecordIdValue;
	public Id ProductCategoryId;
	public ProductCategory ProductCategory;
	public Id ProductId;
	public Product2 Product;
	public Id PromotionId;
	public Promotion Promotion;
	public Decimal Quantity;
	public Id QuantityUnitOfMeasureId;
	public UnitOfMeasure QuantityUnitOfMeasure;
	public String RedeemedPointsExpirationInformation;
	public Id ReferenceRecordId;
	public Asset ReferenceRecord;
	public Id ReferredMemberId;
	public LoyaltyProgramMember ReferredMember;
	public Id RelatedCorporateMembershipId;
	public LoyaltyProgramMember RelatedCorporateMembership;
	public Id RelatedJournalId;
	public TransactionJournal RelatedJournal;
	public String ReplayId;
	public String SecondaryRecordIdValue;
	public Datetime StartDate;
	public String Status;
	public Decimal TransactionAmount;
	public String TransactionLocation;
	public String TraveledFareClass;
	public String UniqueIdentifier;
	public Id UsageResourceId;
	public UsageResource UsageResource;
	public Id UsageSummaryId;
	public UsageSummary UsageSummary;
	public String UsageType;
	public String VoucherCode;

	public TransactionJournalChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public TransactionJournalChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public TransactionJournalChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public TransactionJournalChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public TransactionJournalChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
