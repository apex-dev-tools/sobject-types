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
public class DocumentGenerationProcess extends SObject {
	public static SObjectType$<DocumentGenerationProcess> SObjectType;
	public static SObjectFields$<DocumentGenerationProcess> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DataRaptorInput;
	public String DocGenAdditionalInput;
	public String DocGenAdditionalInputType;
	public String DocGenApiVersionType;
	public String DocumentInputType;
	public Id DocumentTemplateId;
	public DocumentTemplate DocumentTemplate;
	public Integer EstimatedDocumentSize;
	public Boolean HasDocGenFontSource;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String PdfDocIdentifiersList;
	public String ReferenceObject;
	public String RequestText;
	public String ResponseText;
	public String Status;
	public Datetime SystemModstamp;
	public String TokenData;
	public Id TokenDataContentDocumentId;
	public ContentDocument TokenDataContentDocument;
	public String Type;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public DocGenerationQueryResult[] DocGenerationQueryResults;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public DocumentGenerationProcessShare[] Shares;

	public DocumentGenerationProcess clone$() {throw new java.lang.UnsupportedOperationException();}
	public DocumentGenerationProcess clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DocumentGenerationProcess clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DocumentGenerationProcess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DocumentGenerationProcess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
