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
public class DocumentTemplateSection extends SObject {
	public static SObjectType$<DocumentTemplateSection> SObjectType;
	public static SObjectFields$<DocumentTemplateSection> Fields;

	public String AccessType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DisplayConditionExpression;
	public Id DocumentTemplateId;
	public DocumentTemplate DocumentTemplate;
	public Id EmbeddedDocumentTemplateId;
	public DocumentTemplate EmbeddedDocumentTemplate;
	public String EmbeddedKey;
	public Boolean HasSectionNumberReset;
	public Id Id;
	public Boolean IsBatchable;
	public Boolean IsDeleted;
	public Boolean IsDisplayOnNewPage;
	public Boolean IsNewLineAfterSectionEnabled;
	public Boolean IsSectionNumberDisplayEnabled;
	public Boolean IsTableHeaderRepeatable;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String ReferenceClassName;
	public String SectionContent;
	public Decimal SectionSequenceNumber;
	public String SectionType;
	public String SectionTypeItemFontStyle;
	public String SectionTypeItemFontValue;
	public String SectionTypeSignatureContent;
	public Boolean ShouldDisplayHeaderContentInline;
	public Boolean ShouldDisplayHeaderName;
	public Boolean ShouldGenerateEmbeddedKey;
	public Datetime SystemModstamp;
	public String TokenList;
	public Integer TotalSectionConditionCount;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocTemplateSectionCondition[] DocumentTemplateSections;
	public DocumentTemplateToken[] DocumentTemplateTokens;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public DocumentTemplateSectionFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocumentSection[] GenDocSecDocuTempSections;
	public DocumentTemplateSectionHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public DocumentTemplateSection clone$() {throw new java.lang.UnsupportedOperationException();}
	public DocumentTemplateSection clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DocumentTemplateSection clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DocumentTemplateSection clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DocumentTemplateSection clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
