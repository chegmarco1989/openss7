// vim: sw=4 et tw=72 com=srO\:/**,mb\:*,ex\:*/,srO\:/*,mb\:*,ex\:*/,b\:TRANS,\://,b\:#,\:%,\:XCOMM,n\:>,fb\:-
/*
 @(#) $RCSfile: TDMCktEcPrpt.java,v $ $Name:  $($Revision: 1.1.2.1 $) $Date: 2009-06-21 11:35:47 $ <p>
 
 Copyright &copy; 2008-2009  Monavacon Limited <a href="http://www.monavacon.com/">&lt;http://www.monavacon.com/&gt;</a>. <br>
 Copyright &copy; 2001-2008  OpenSS7 Corporation <a href="http://www.openss7.com/">&lt;http://www.openss7.com/&gt;</a>. <br>
 Copyright &copy; 1997-2001  Brian F. G. Bidulock <a href="mailto:bidulock@openss7.org">&lt;bidulock@openss7.org&gt;</a>. <p>
 
 All Rights Reserved. <p>
 
 This program is free software: you can redistribute it and/or modify it under
 the terms of the GNU Affero General Public License as published by the Free
 Software Foundation, version 3 of the license. <p>
 
 This program is distributed in the hope that it will be useful, but <b>WITHOUT
 ANY WARRANTY</b>; without even the implied warranty of <b>MERCHANTABILITY</b>
 or <b>FITNESS FOR A PARTICULAR PURPOSE</b>.  See the GNU Affero General Public
 License for more details. <p>
 
 You should have received a copy of the GNU Affero General Public License along
 with this program.  If not, see
 <a href="http://www.gnu.org/licenses/">&lt;http://www.gnu.org/licenses/&gt</a>,
 or write to the Free Software Foundation, Inc., 675 Mass Ave, Cambridge, MA
 02139, USA. <p>
 
 <em>U.S. GOVERNMENT RESTRICTED RIGHTS</em>.  If you are licensing this
 Software on behalf of the U.S. Government ("Government"), the following
 provisions apply to you.  If the Software is supplied by the Department of
 Defense ("DoD"), it is classified as "Commercial Computer Software" under
 paragraph 252.227-7014 of the DoD Supplement to the Federal Acquisition
 Regulations ("DFARS") (or any successor regulations) and the Government is
 acquiring only the license rights granted herein (the license rights
 customarily provided to non-Government users).  If the Software is supplied to
 any unit or agency of the Government other than DoD, it is classified as
 "Restricted Computer Software" and the Government's rights in the Software are
 defined in paragraph 52.227-19 of the Federal Acquisition Regulations ("FAR")
 (or any successor regulations) or, in the cases of NASA, in paragraph
 18.52.227-86 of the NASA Supplement to the FAR (or any successor regulations). <p>
 
 Commercial licensing and support of this software is available from OpenSS7
 Corporation at a fee.  See
 <a href="http://www.openss7.com/">http://www.openss7.com/</a> <p>
 
 Last Modified $Date: 2009-06-21 11:35:47 $ by $Author: brian $
 */

// vim: sw=4 et tw=72 com=srO\:/**,mb\:*,ex\:*/,srO\:/*,mb\:*,ex\:*/,b\:TRANS,\://,b\:#,\:%,\:XCOMM,n\:>,fb\:-
/*

   Overview Package  Class Tree Index Help
   JAIN^TM MEGACO API (RELEASE) - Version 1.0 - 22 December 2003
    PREV CLASS   NEXT CLASS FRAMESNO FRAMES
   SUMMARY:  INNER | FIELD | CONSTR | METHOD DETAIL:  FIELD | CONSTR |
   METHOD
     _________________________________________________________________

javax.megaco.pkg.TDMCktPkg
Class TDMCktEcPrpt

java.lang.Object
    |
    +--javax.megaco.pkg.PkgItem
        |
        +--javax.megaco.pkg.PkgPrptyItem
               |
               +--javax.megaco.pkg.TDMCktPkg.TDMCktEcPrpt

   All Implemented Interfaces:
          None
     _________________________________________________________________

   public class TDMCktEcPrpt
   extends PkgPrptyItem

   The MEGACO Echo Cancellation property class extends the PkgPrptyItem
   class. This is a final class. This class defines Echo Cancellation
   property of MEGACO TDM Circuit package. The methods shall define that
   this property item belongs to the TDM Circuit package.
     _________________________________________________________________

   Constructor Summary
   TDMCktEcPrpt()
              Constructs a MEGACO property Item with property id as Echo
   Cancellation.

   Method Summary
    java.lang.String toString()
             Overrides java.lang.Object.toString().

   Field Summary
    public static final int TDMC_EC_PRPT
               Identifies Echo cancellation property of the MEGACO TDM
   Circuit Package.

   Methods inherited from class java.lang.Object
   clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait

   Methods inherited from class javax.megaco.pkg.PkgItem
   getItemName, getItemId, getItemsPkgId

   Methods inherited from class javax.megaco.pkg.PkgPrptyItem
   getPropertyId

   Constructor Detail

  TDMCktEcPrpt

public TDMCktEcPrpt()

          Constructs a Jain MEGACO Object representing property Item of
          the MEGACO Package for property Echo Cancellation and Package
          as TDM Circuit.

   Method Detail

  getPropertyId

public int getPropertyId()

          This method is used to get the property identifier from an
          Property Item object. The implementations of this method in
          this class returns the id of the Echo Cancellation property of
          TDMC Package.

        Returns:
                It shall return TDMC_EC_PRPT.
     _________________________________________________________________

  getItemId

public int getItemId()

          This method is used to get the item identifier from an Item
          object. The implementations of this method in this class
          returns the id of the Echo Cancellation property of TDMC
          Package.

        Returns:
                It shall return TDMC_EC_PRPT.
     _________________________________________________________________

  getItemsPkgId

public static int getItemsPkgId()

          This method gets the package id to which the item belongs.
          Since the Echo Cancellation property is defined in the TDMC
          Package of MEGACO protocol, this method returns the value
          TDM_CKT_PACKAGE constant. This constant is defined in the
          PkgConsts class.

        Returns:
                The package id TDM_CKT_PACKAGE.
      _______________________________________________________________

  getItemValueType

public int getItemValueType()

          The method can be used to get the type of the value as defined
          in the MEGACO packages. These could be one of string or
          enumerated value or integer or double value or boolean.



        Returns:
                It returns ITEM_PARAM_VALUE_BOOLEAN indicating that the
                parameter is a double.
          _______________________________________________________________

  getItemsDescriptorIds

public int[] getDescriptorIds()

          The method can be used to get the descriptor ids corresponding
          to the parameters to which the parameter can be set.

        Returns:

                 This parameter can be present in Event descriptor. It
          shall thus return a value M_LOCAL_CONTROL_DESC as a part of
          integer vector.
     _________________________________________________________________

  toString

public java.lang.String toString()

          Overrides java.lang.Object.toString().


        Overrides:
                toString in class java.lang.Object
     _________________________________________________________________

   Field Detail

  TDMC_EC_PRPT

public static final int TDMC_EC_PRPT

          Identifies Echo cancellation property of the MEGACO TDM Circuit
          Package. Its value shall be set equal to 0x0008.
     _________________________________________________________________
     _________________________________________________________________

   Overview Package  Class Tree Index Help
   JAIN^TM MEGACO API (RELEASE) - Version 1.0 - 22 December 2003
    PREV CLASS   NEXT CLASS FRAMESNO FRAMES
   SUMMARY:  INNER | FIELD | CONSTR | METHOD DETAIL:  FIELD | CONSTR |
   METHOD
     _________________________________________________________________

                  Copyright � 2001 Hughes Software Systems
       HUGHES SOFTWARE SYSTEMS and JAIN JSPA SIGNATORIES PROPRIETARY
        This document contains proprietary information that shall be
     distributed, routed or made available only within Hughes Software
       Systems and JAIN JSPA Signatory Companies, except with written
                   permission of Hughes Software Systems
             _________________________________________________

   22 December 2003


    If you have any comments or queries, please mail them to
    Jmegaco_hss@hss.hns.com
*/