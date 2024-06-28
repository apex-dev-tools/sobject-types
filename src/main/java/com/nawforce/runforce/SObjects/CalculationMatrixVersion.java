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
public class CalculationMatrixVersion extends SObject {
	public static SObjectType$<CalculationMatrixVersion> SObjectType;
	public static SObjectFields$<CalculationMatrixVersion> Fields;

	public String ApiName;
	public Id CalculationMatrixId;
	public CalculationMatrix CalculationMatrix;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DecisionMatrixDefinitionVerId;
	public DecisionMatrixDefinitionVersion DecisionMatrixDefinitionVer;
	public String DscnModelNoteExportStatus;
	public Datetime EndDateTime;
	public String GroupKey;
	public String GroupKeyValue;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsEnabled;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LoadProcessStatus;
	public String MatrixType;
	public String Name;
	public String Namespace;
	public Integer Rank;
	public Datetime StartDateTime;
	public String SubGroupKey;
	public String SubGroupKeyValue;
	public Datetime SystemModstamp;
	public Integer VersionNumber;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CalcMatrixColumnRange[] CalcMatrixVersionColumnRanges;
	public CalculationMatrixRow[] CalculationMatrixRows;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CalculationMatrixVersionFeed[] Feeds;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CalculationMatrixVersionHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public CalculationMatrixVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public CalculationMatrixVersion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CalculationMatrixVersion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CalculationMatrixVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CalculationMatrixVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
