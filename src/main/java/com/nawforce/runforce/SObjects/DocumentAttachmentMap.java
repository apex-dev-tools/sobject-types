/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DocumentAttachmentMap extends SObject {
	public static SObjectType$<DocumentAttachmentMap> SObjectType;
	public static SObjectFields$<DocumentAttachmentMap> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DocumentId;
	public Document Document;
	public Integer DocumentSequence;
	public Id Id;
	public Id ParentId;
	public EmailTemplate Parent;

	public DocumentAttachmentMap clone$() {throw new java.lang.UnsupportedOperationException();}
	public DocumentAttachmentMap clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DocumentAttachmentMap clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DocumentAttachmentMap clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DocumentAttachmentMap clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
