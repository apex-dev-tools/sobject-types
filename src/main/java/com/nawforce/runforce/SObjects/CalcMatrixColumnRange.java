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
public class CalcMatrixColumnRange extends SObject {
	public static SObjectType$<CalcMatrixColumnRange> SObjectType;
	public static SObjectFields$<CalcMatrixColumnRange> Fields;

	public Id CalculationMatrixColumnId;
	public CalculationMatrixColumn CalculationMatrixColumn;
	public Id CalculationMatrixVersionId;
	public CalculationMatrixVersion CalculationMatrixVersion;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Integer Occurrence;
	public String RangeStartValue;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CalcMatrixColumnRangeFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CalcMatrixColumnRangeHistory[] Histories;

	public CalcMatrixColumnRange clone$() {throw new java.lang.UnsupportedOperationException();}
	public CalcMatrixColumnRange clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CalcMatrixColumnRange clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CalcMatrixColumnRange clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CalcMatrixColumnRange clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
