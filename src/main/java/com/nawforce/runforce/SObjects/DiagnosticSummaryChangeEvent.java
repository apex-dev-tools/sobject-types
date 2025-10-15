/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DiagnosticSummaryChangeEvent extends SObject {
	public static SObjectType$<DiagnosticSummaryChangeEvent> SObjectType;
	public static SObjectFields$<DiagnosticSummaryChangeEvent> Fields;

	public String AttachmentLanguage;
	public Id AuthenticatorId;
	public SObject Authenticator;
	public Id BasedOnId;
	public SObject BasedOn;
	public Id CareObservationId;
	public CareObservation CareObservation;
	public Id CaseId;
	public Case Case;
	public String Category;
	public Object ChangeEventHeader;
	public Id ClinicalEncounterId;
	public ClinicalEncounter ClinicalEncounter;
	public Id CodeId;
	public CodeSetBundle Code;
	public Id ContentDocumentId;
	public ContentDocument ContentDocument;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id CustodianId;
	public Account Custodian;
	public String Division;
	public Id DocumentFormatCodeId;
	public CodeSet DocumentFormatCode;
	public Id DocumentSecurityCodeId;
	public CodeSetBundle DocumentSecurityCode;
	public String DocumentStage;
	public Id DocumentTypeCodeId;
	public CodeSetBundle DocumentTypeCode;
	public Datetime EffectiveEndDateTime;
	public Datetime EffectiveStartDateTime;
	public Id Id;
	public String ImageComments1;
	public String ImageComments2;
	public String ImageComments3;
	public String ImageComments4;
	public String ImageComments5;
	public String ImageUrl1;
	public String ImageUrl2;
	public String ImageUrl3;
	public String ImageUrl4;
	public String ImageUrl5;
	public Id InterpretedById;
	public CarePerformer InterpretedBy;
	public Id IssuedById;
	public CarePerformer IssuedBy;
	public Datetime IssuedDateTime;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PatientId;
	public Account Patient;
	public String ReplayId;
	public Id ReportAttachmentId;
	public Attachment ReportAttachment;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public String Status;
	public String Summary;
	public Id SummaryCodeId;
	public CodeSetBundle SummaryCode;
	public String UsageType;

	public DiagnosticSummaryChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DiagnosticSummaryChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DiagnosticSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DiagnosticSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DiagnosticSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
