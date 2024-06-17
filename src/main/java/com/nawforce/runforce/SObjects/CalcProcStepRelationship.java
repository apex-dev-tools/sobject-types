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
public class CalcProcStepRelationship extends SObject {
	public static SObjectType$<CalcProcStepRelationship> SObjectType;
	public static SObjectFields$<CalcProcStepRelationship> Fields;

	public Id CalcProcStepId;
	public CalculationProcedureStep CalcProcStep;
	public Id CalcProcVersionId;
	public CalculationProcedureVersion CalcProcVersion;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public String Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String Namespace;
	public Id ParentCalcProcStepId;
	public CalculationProcedureStep ParentCalcProcStep;
	public Integer Priority;
	public String RelationshipType;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CalcProcStepRelationshipFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CalcProcStepRelationshipHistory[] Histories;

	public CalcProcStepRelationship clone$() {throw new java.lang.UnsupportedOperationException();}
	public CalcProcStepRelationship clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CalcProcStepRelationship clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CalcProcStepRelationship clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CalcProcStepRelationship clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
