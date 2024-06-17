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
public class DocumentTemplate extends SObject {
	public static SObjectType$<DocumentTemplate> SObjectType;
	public static SObjectFields$<DocumentTemplate> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String CustomClassName;
	public String DefaultFontStyle;
	public String DocumentConversionResourceName;
	public String DocumentGenerationMechanism;
	public String ExtractOmniDataTransformName;
	public String GlobalKey;
	public Boolean HasBatchableSection;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsSectionProcessed;
	public String LastEmbeddedTmplSectionKey;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String MapperOmniDataTransformName;
	public String Name;
	public String Namespace;
	public Id OwnerId;
	public Name Owner;
	public String SectionHeaderFontStyle;
	public String SectionHeaderFontStyleValue;
	public Boolean ShouldDisplayUnmappedToken;
	public Boolean ShouldExtractEmbeddedTmplToken;
	public String Status;
	public Datetime SystemModstamp;
	public String TargetTokenItemObject;
	public String TargetTokenObject;
	public String TokenList;
	public String TokenMappingMethodType;
	public String TokenMappingType;
	public String Type;
	public String UniqueName;
	public String UsageType;
	public Integer VersionNumber;
	public String XmlRelationshipMetadata;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocGenerationQueryResult[] DocGenerationQueryResults;
	public DocumentTemplateContentDoc[] DocTempContentDocDocTemplates;
	public DocumentTemplateSection[] DocumentTemplateSections;
	public DocumentTemplateToken[] DocumentTemplateTokenAssociation;
	public DocumentGenerationProcess[] DocumentTemplates;
	public EmailMessage[] Emails;
	public DocumentTemplateSection[] EmbeddedDocumentTemplates;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public DocumentTemplateFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocDocTemplates;
	public DocumentTemplateHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public DocumentTemplateShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public DocumentTemplate clone$() {throw new java.lang.UnsupportedOperationException();}
	public DocumentTemplate clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DocumentTemplate clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DocumentTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DocumentTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
