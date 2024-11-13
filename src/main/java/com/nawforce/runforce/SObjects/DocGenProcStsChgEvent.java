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
public class DocGenProcStsChgEvent extends SObject {
	public static SObjectType$<DocGenProcStsChgEvent> SObjectType;
	public static SObjectFields$<DocGenProcStsChgEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DocGenProcessIdentifier;
	public String Error;
	public String EventUuid;
	public String PdfDocumentIdentifier;
	public String ReplayId;
	public String Status;
	public String WordDocumentIdentifier;

	public DocGenProcStsChgEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DocGenProcStsChgEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DocGenProcStsChgEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DocGenProcStsChgEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DocGenProcStsChgEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
