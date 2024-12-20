/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CspTrustedSite extends SObject {
	public static SObjectType$<CspTrustedSite> SObjectType;
	public static SObjectFields$<CspTrustedSite> Fields;

	public Boolean CanAccessCamera;
	public Boolean CanAccessMicrophone;
	public String Context;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public String EndpointUrl;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsApplicableToConnectSrc;
	public Boolean IsApplicableToFontSrc;
	public Boolean IsApplicableToFrameSrc;
	public Boolean IsApplicableToImgSrc;
	public Boolean IsApplicableToMediaSrc;
	public Boolean IsApplicableToStyleSrc;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Id MobileExtensionId;
	public FieldServiceMobileExtension MobileExtension;
	public String NamespacePrefix;
	public Datetime SystemModstamp;

	public CspTrustedSite clone$() {throw new java.lang.UnsupportedOperationException();}
	public CspTrustedSite clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CspTrustedSite clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CspTrustedSite clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CspTrustedSite clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
