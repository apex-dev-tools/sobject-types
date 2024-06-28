/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ServiceContract extends SObject {
	public static SObjectType$<ServiceContract> SObjectType;
	public static SObjectFields$<ServiceContract> Fields;

	public Id AccountId;
	public Account Account;
	public Datetime ActivationDate;
	public Decimal AdditionalDiscount;
	public String ApprovalStatus;
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
	public Id ContactId;
	public Contact Contact;
	public String ContractNumber;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Decimal Discount;
	public Date EndDate;
	public Decimal GrandTotal;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Integer LineItemCount;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id ParentServiceContractId;
	public ServiceContract ParentServiceContract;
	public Id Pricebook2Id;
	public Pricebook2 Pricebook2;
	public Id RootServiceContractId;
	public ServiceContract RootServiceContract;
	public Address ShippingAddress;
	public String ShippingCity;
	public String ShippingCountry;
	public String ShippingCountryCode;
	public String ShippingGeocodeAccuracy;
	public Decimal ShippingHandling;
	public Decimal ShippingLatitude;
	public Decimal ShippingLongitude;
	public String ShippingPostalCode;
	public String ShippingState;
	public String ShippingStateCode;
	public String ShippingStreet;
	public String SpecialTerms;
	public Date StartDate;
	public String Status;
	public Decimal Subtotal;
	public Datetime SystemModstamp;
	public Decimal Tax;
	public Integer Term;
	public Decimal TotalPrice;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public ServiceContract[] ChildServiceContracts;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ContractLineItem[] ContractLineItems;
	public ContractLineOutcome[] ContractLineOutcomes;
	public ServiceContract[] DescendantServiceContracts;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public Entitlement[] Entitlements;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ServiceContractFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ServiceContractHistory[] Histories;
	public MaintenancePlan[] MaintenancePlans;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public ServiceContractShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public WorkOrder[] WorkOrders;
	public WorkPlanSelectionRule[] WorkPlanSelectionRules;

	public ServiceContract clone$() {throw new java.lang.UnsupportedOperationException();}
	public ServiceContract clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ServiceContract clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ServiceContract clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ServiceContract clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
