/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class Scontrol extends SObject {
	public static SObjectType$<Scontrol> SObjectType;
	public static SObjectFields$<Scontrol> Fields;

	public Blob Binary;
	public Integer BodyLength;
	public String ContentSource;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public String EncodingKey;
	public String Filename;
	public String HtmlWrapper;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String NamespacePrefix;
	public Boolean SupportsCaching;
	public Datetime SystemModstamp;

	public ScontrolLocalization[] Localization;

	public Scontrol clone$() {throw new java.lang.UnsupportedOperationException();}
	public Scontrol clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Scontrol clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Scontrol clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Scontrol clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
