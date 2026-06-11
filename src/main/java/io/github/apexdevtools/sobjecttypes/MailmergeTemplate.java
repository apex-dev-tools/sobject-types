/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class MailmergeTemplate extends SObject {
	public static SObjectType$<MailmergeTemplate> SObjectType;
	public static SObjectFields$<MailmergeTemplate> Fields;

	public Blob Body;
	public Integer BodyLength;
	public String Category;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String Filename;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastUsedDate;
	public String Name;
	public Boolean SecurityOptionsAttachmentHasFlash;
	public Boolean SecurityOptionsAttachmentHasXSSThreat;
	public Boolean SecurityOptionsAttachmentScannedForXSS;
	public Boolean SecurityOptionsAttachmentScannedforFlash;
	public Datetime SystemModstamp;

	public MailmergeTemplate clone$() {throw new java.lang.UnsupportedOperationException();}
	public MailmergeTemplate clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MailmergeTemplate clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MailmergeTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MailmergeTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
