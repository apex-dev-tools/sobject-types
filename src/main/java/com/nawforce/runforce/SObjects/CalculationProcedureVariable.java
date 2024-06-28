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
public class CalculationProcedureVariable extends SObject {
	public static SObjectType$<CalculationProcedureVariable> SObjectType;
	public static SObjectFields$<CalculationProcedureVariable> Fields;

	public String ApiName;
	public String CalculationMatrixName;
	public Id CalculationProcedureVersionId;
	public CalculationProcedureVersion CalculationProcedureVersion;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DataType;
	public String DefaultValue;
	public String DisplayName;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsEditable;
	public Boolean IsUserDefined;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String Namespace;
	public Integer Precision;
	public Datetime SystemModstamp;
	public Integer UiDisplayOrder;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CalculationProcedureVariableFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CalculationProcedureVariableHistory[] Histories;

	public CalculationProcedureVariable clone$() {throw new java.lang.UnsupportedOperationException();}
	public CalculationProcedureVariable clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CalculationProcedureVariable clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CalculationProcedureVariable clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CalculationProcedureVariable clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
