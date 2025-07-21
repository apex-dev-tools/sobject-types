/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class Order extends SObject {
	public static SObjectType$<Order> SObjectType;
	public static SObjectFields$<Order> Fields;

	public Id RecordTypeId;
	public RecordType RecordType;
	public Id AccountId;
	public Account Account;
	public Id ActivatedById;
	public User ActivatedBy;
	public Datetime ActivatedDate;
	public Id BillToContactId;
	public Contact BillToContact;
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
	public Id CompanyAuthorizedById;
	public User CompanyAuthorizedBy;
	public Date CompanyAuthorizedDate;
	public Id ContractId;
	public Contract Contract;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id CustomerAuthorizedById;
	public Contact CustomerAuthorizedBy;
	public Date CustomerAuthorizedDate;
	public String Description;
	public String Division;
	public Date EffectiveDate;
	public Date EndDate;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsReductionOrder;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OpportunityId;
	public Opportunity Opportunity;
	public String OrderNumber;
	public String OrderReferenceNumber;
	public Id OriginalOrderId;
	public Order OriginalOrder;
	public Id OwnerId;
	public Name Owner;
	public Date PoDate;
	public String PoNumber;
	public Id Pricebook2Id;
	public Pricebook2 Pricebook2;
	public Id QuoteId;
	public Quote Quote;
	public Id ShipToContactId;
	public Contact ShipToContact;
	public Address ShippingAddress;
	public String ShippingCity;
	public String ShippingCountry;
	public String ShippingCountryCode;
	public String ShippingGeocodeAccuracy;
	public Decimal ShippingLatitude;
	public Decimal ShippingLongitude;
	public String ShippingPostalCode;
	public String ShippingState;
	public String ShippingStateCode;
	public String ShippingStreet;
	public String Status;
	public String StatusCode;
	public Datetime SystemModstamp;
	public Decimal TotalAmount;
	public String Type;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AppUsageAssignment[] AppUsageAssignments;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CartCheckoutSession[] CheckoutSessions;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public CreditMemo[] CreditMemos;
	public DigitalSignature[] DigitalSignatures;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EngagementTopic[] EngagementInitiatedTopic;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public OrderFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public AuthFormRequestRecord[] FormRequestRecordRelatedRecords;
	public FulfillmentOrder[] FulfillmentOrders;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public OrderHistory[] Histories;
	public InfoAuthorizationRequest[] InfoAuthRequestSourceRecords;
	public Invoice[] Invoices;
	public NetworkUserHistoryRecent[] NetworkUserHistoryRecentToRecord;
	public TransactionJournal[] JournalOrders;
	public MultipartyInfoAuthRequest[] MultipartyInfoAuthRequestSourceRecords;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public LoyaltyPgmPtnrPrepaidPack[] Order;
	public OrderItem[] OrderItems;
	public Order[] Orders;
	public NetworkActivityAudit[] ParentEntities;
	public PaymentGroup[] PaymentGroups;
	public RevenueTransactionErrorLog[] PrimaryRevenueTransactionErrorLogs;
	public ProcessException[] ProcessExceptions;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public RecordAlert[] RecordAlertWhat;
	public AsyncOperationTracker[] ReferenceEntityAsyncOperationTrackers;
	public RevenueAsyncOperation[] ReferenceEntityRevenueAsyncOperations;
	public ReturnOrder[] ReturnOrders;
	public OrderShare[] Shares;
	public SurveySubject[] SurveySubjectEntities;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;
	public WorkOrderLineItem[] WorkOrderLineItems;

	public Order clone$() {throw new java.lang.UnsupportedOperationException();}
	public Order clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Order clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Order clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Order clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
