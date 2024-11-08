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
public class DocumentGenerationSetting extends SObject {
	public static SObjectType$<DocumentGenerationSetting> SObjectType;
	public static SObjectFields$<DocumentGenerationSetting> Fields;

	public Decimal BatchDocGnrnPctLimitPerHour;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public String DocumentTemplateLibraryName;
	public String GenerationMechanism;
	public String GuestAccessNamedCredential;
	public Id Id;
	public Integer InProgDocGenRqstTmot;
	public Boolean IsBatchDocGnrnEnabled;
	public Boolean IsDeleted;
	public Boolean IsInProgRqstTmotEnab;
	public Boolean IsServerSideDocGenEnabled;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String PreviewType;
	public Datetime SystemModstamp;

	public DocumentGenerationSetting clone$() {throw new java.lang.UnsupportedOperationException();}
	public DocumentGenerationSetting clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DocumentGenerationSetting clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DocumentGenerationSetting clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DocumentGenerationSetting clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
