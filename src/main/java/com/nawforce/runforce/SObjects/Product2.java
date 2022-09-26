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
public class Product2 extends SObject {
	public static SObjectType$<Product2> SObjectType;
	public static SObjectFields$<Product2> Fields;

	public Boolean CanUseQuantitySchedule;
	public Boolean CanUseRevenueSchedule;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String DisplayUrl;
	public Id ExternalDataSourceId;
	public ExternalDataSource ExternalDataSource;
	public String ExternalId;
	public String Family;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsArchived;
	public Boolean IsDeleted;
	public Boolean IsSerialized;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Integer NumberOfQuantityInstallments;
	public Integer NumberOfRevenueInstallments;
	public String ProductCode;
	public String QuantityInstallmentPeriod;
	public String QuantityScheduleType;
	public String QuantityUnitOfMeasure;
	public String RevenueInstallmentPeriod;
	public String RevenueScheduleType;
	public String StockKeepingUnit;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public Asset[] Assets;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ContractLineItem[] ContractLineItems;
	public CreditMemoLine[] CreditMemoLines;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public Product2Feed[] Feeds;
	public Product2History[] Histories;
	public InvoiceLine[] InvoiceLines;
	public NetworkUserHistoryRecent[] NetworkUserHistoryRecentToRecord;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public PricebookEntry[] PricebookEntries;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductConsumptionSchedule[] ProductConsumptionSchedules;
	public ProductItem[] ProductItems;
	public ProductRequestLineItem[] ProductRequestLineItems;
	public ProductServiceCampaignItem[] ProductServiceCampaignItems;
	public ProductServiceCampaign[] ProductServiceCampaignProducts;
	public ProductTransfer[] ProductTransfers;
	public ProductWarrantyTerm[] ProductWarrantyTermProducts;
	public ProductConsumed[] ProductsConsumed;
	public ProductRequired[] ProductsRequired;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public ReturnOrderLineItem[] ReturnOrderLineItems;
	public SerializedProduct[] SerializedProducts;
	public ShipmentItem[] ShipmentItems;
	public SurveySubject[] SurveySubjectEntities;
	public Task[] Tasks;
	public WorkOrderLineItem[] WorkOrderLineItems;
	public WorkPlanSelectionRule[] WorkPlanSelectionRules;

	public Product2 clone$() {throw new java.lang.UnsupportedOperationException();}
	public Product2 clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Product2 clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Product2 clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Product2 clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
