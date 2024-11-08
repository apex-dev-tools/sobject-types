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
public class ProductAttributeDefinition extends SObject {
	public static SObjectType$<ProductAttributeDefinition> SObjectType;
	public static SObjectFields$<ProductAttributeDefinition> Fields;

	public Id AttributeCategoryId;
	public AttributeCategory AttributeCategory;
	public Id AttributeDefinitionId;
	public AttributeDefinition AttributeDefinition;
	public String AttributeNameOverride;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DefaultValue;
	public String Description;
	public String DisplayType;
	public String ExcludedPicklistValues;
	public String HelpText;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsHidden;
	public Boolean IsPriceImpacting;
	public Boolean IsReadOnly;
	public Boolean IsRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Integer MaximumCharacterCount;
	public String MaximumValue;
	public Integer MinimumCharacterCount;
	public String MinimumValue;
	public String Name;
	public Id OverriddenProductAttributeDefinitionId;
	public ProductAttributeDefinition OverriddenProductAttributeDefinition;
	public Id OverrideContextId;
	public Name OverrideContext;
	public Id OwnerId;
	public Name Owner;
	public Id Product2Id;
	public Product2 Product2;
	public Id ProductClassificationAttributeId;
	public ProductClassificationAttr ProductClassificationAttribute;
	public Integer Sequence;
	public String Status;
	public String StepValue;
	public Datetime SystemModstamp;
	public String ValueDescription;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public AttrPicklistExcludedValue[] AttrPicklistExcludedValues;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ProductAttributeDefinitionFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ProductAttributeDefinitionHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProductAttributeDefinition[] OverriddenProductAttributeDefinitions;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductAttributeDefinitionShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public ProductAttributeDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductAttributeDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductAttributeDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductAttributeDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductAttributeDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
